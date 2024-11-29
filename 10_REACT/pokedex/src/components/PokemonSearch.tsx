import { useState, useEffect } from "react";
import TipoCard from "./TipoCard"; // Importamos el nuevo componente de tarjetas

// Definimos los tipos de Pokémon manualmente
interface Type {
    name: string;
    color: string; // Ahora cada tipo tiene un color asociado
}

// Lista manual de tipos de Pokémon y sus colores
const pokemonTypes: Type[] = [
    { name: "fire", color: "bg-red-500" },
    { name: "water", color: "bg-blue-500" },
    { name: "grass", color: "bg-green-500" },
    { name: "electric", color: "bg-yellow-500" },
    { name: "psychic", color: "bg-purple-500" },
    { name: "bug", color: "bg-green-300" },
    { name: "dragon", color: "bg-indigo-600" },
    { name: "ghost", color: "bg-purple-700" },
    { name: "normal", color: "bg-gray-400" },
    { name: "fairy", color: "bg-pink-500" },
    { name: "ice", color: "bg-blue-200" },
    { name: "dark", color: "bg-gray-700" },
    { name: "steel", color: "bg-gray-600" },
    { name: "fighting", color: "bg-red-700" },
    { name: "poison", color: "bg-purple-400" },
    { name: "ground", color: "bg-yellow-700" },
    { name: "rock", color: "bg-gray-500" },
    { name: "flying", color: "bg-sky-500" },
];

interface Pokemon {
    name: string;
    url: string;
}

interface PokemonTypeResponse {
    pokemon: { pokemon: Pokemon }[]; // Nos interesan solo los IDs de los Pokémon
}

const PokemonSearch: React.FC = () => {
    const [types] = useState<Type[]>(pokemonTypes); // Usamos la lista manual de tipos
    const [selectedType, setSelectedType] = useState<string>("");
    const [pokemonIds, setPokemonIds] = useState<number[]>([]); // Ahora almacenamos IDs de Pokémon

    // Obtener la lista de Pokémon según el tipo seleccionado (solo IDs)
    useEffect(() => {
        if (selectedType) {
            fetch(`https://pokeapi.co/api/v2/type/${selectedType}`)
                .then((response) => response.json())
                .then((data: PokemonTypeResponse) => {
                    const ids = data.pokemon.map((p) => {
                        // Extraemos solo el ID de cada Pokémon
                        const pokemonId = parseInt(p.pokemon.url.split("/")[6]);
                        return pokemonId;
                    });
                    // Limitamos los Pokémon a aquellos con ID <= 151
                    setPokemonIds(ids.filter((id) => id <= 151));
                })
                .catch((error) => console.error("Error fetching Pokémon:", error));
        } else {
            setPokemonIds([]);
        }
    }, [selectedType]);

    return (
        <div className="p-4">
            <h3 className="font-bold mb-4">Buscar Pokémon por tipo</h3>
            <select
                className="border rounded p-2 w-full mb-4"
                value={selectedType}
                onChange={(e) => setSelectedType(e.target.value)}
            >
                <option value="">Selecciona un tipo</option>
                {types.map((type) => (
                    <option key={type.name} value={type.name}>
                        {type.name}
                    </option>
                ))}
            </select>

            {/* Mostramos las tarjetas solo si hay IDs */}
            <div className="grid grid-cols-2 sm:grid-cols-3 md:grid-cols-4 lg:grid-cols-5 gap-4">
                {pokemonIds.map((pokemonId) => (
                    <TipoCard key={pokemonId} pokemonId={pokemonId} />
                ))}
            </div>
        </div>
    );
};

export default PokemonSearch;
