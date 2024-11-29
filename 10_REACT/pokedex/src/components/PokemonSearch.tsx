import { useState, useEffect } from "react";

// Definir interfaces para los datos de la API
interface Type {
    name: string;
    url: string;
}

interface Pokemon {
    name: string;
    url: string;
}

interface PokemonTypeResponse {
    pokemon: { pokemon: Pokemon }[];
}

function PokemonSearch() {
    const [types, setTypes] = useState<Type[]>([]);
    const [selectedType, setSelectedType] = useState<string>("");
    const [pokemonList, setPokemonList] = useState<Pokemon[]>([]);

    // Obtener la lista de tipos de Pokémon
    useEffect(() => {
        fetch("https://pokeapi.co/api/v2/type")
            .then((response) => response.json())
            .then((data) => setTypes(data.results))
            .catch((error) => console.error("Error fetching types:", error));
    }, []);

    // Obtener la lista de Pokémon según el tipo seleccionado
    useEffect(() => {
        if (selectedType) {
            fetch(`https://pokeapi.co/api/v2/type/${selectedType}`)
                .then((response) => response.json())
                .then((data: PokemonTypeResponse) =>
                    setPokemonList(data.pokemon.map((p) => p.pokemon))
                )
                .catch((error) => console.error("Error fetching Pokémon:", error));
        } else {
            setPokemonList([]);
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

            <ul className="list-disc pl-5">
                {pokemonList.map((pokemon) => (
                    <li key={pokemon.name}>{pokemon.name}</li>
                ))}
            </ul>
        </div>
    );
}

export default PokemonSearch;
