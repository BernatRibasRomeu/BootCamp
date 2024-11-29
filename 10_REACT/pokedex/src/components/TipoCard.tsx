import React, { useState, useEffect } from "react";

// Definir las propiedades de TipoCard, donde pokemonId es un número
interface TipoCardProps {
    pokemonId: number; // ID del Pokémon
}

interface PokemonData {
    name: string;
    sprites: {
        front_default: string;
    };
    types: { type: { name: string } }[]; // Tipos del Pokémon
}

// Mapa de tipos de Pokémon con colores correspondientes
const typeColors: Record<string, string> = {
    fire: "bg-red-500",
    water: "bg-blue-500",
    grass: "bg-green-500",
    electric: "bg-yellow-500",
    psychic: "bg-purple-500",
    bug: "bg-green-300",
    dragon: "bg-indigo-600",
    ghost: "bg-purple-700",
    normal: "bg-gray-400",
    fairy: "bg-pink-500",
    ice: "bg-blue-200",
    dark: "bg-gray-700",
    steel: "bg-gray-600",
    fighting: "bg-red-700",
    poison: "bg-purple-400",
    ground: "bg-yellow-700",
    rock: "bg-gray-500",
    flying: "bg-sky-500",
};

// Componente para mostrar la tarjeta de Pokémon
const TipoCard: React.FC<TipoCardProps> = ({ pokemonId }) => {
    const [pokemon, setPokemon] = useState<PokemonData | null>(null);

    // Obtener datos del Pokémon por su ID
    useEffect(() => {
        if (pokemonId <= 151) { // Aseguramos que el ID no sea mayor que 151
            fetch(`https://pokeapi.co/api/v2/pokemon/${pokemonId}`)
                .then((response) => response.json())
                .then((data: PokemonData) => setPokemon(data))
                .catch((error) => console.error("Error fetching Pokémon data:", error));
        }
    }, [pokemonId]);

    // Si no se ha cargado el Pokémon, mostramos un mensaje o un loader
    if (!pokemon) {
        return <div className="border border-gray-300 rounded-lg shadow-md p-4 text-center">Cargando...</div>;
    }

    // Extraemos los tipos del Pokémon
    const pokemonTypes = pokemon.types.map((t) => t.type.name);
    
    // Asignar el color basado en el primer tipo de Pokémon
    const cardColor = pokemonTypes.length > 0 ? typeColors[pokemonTypes[0]] || "bg-gray-400" : "bg-gray-400";

    return (
        <div className={`border border-gray-300 rounded-lg shadow-md p-4 text-center ${cardColor}`}>
            <h2 className="text-lg font-bold">{pokemon.name}</h2>
            <img
                src={pokemon.sprites.front_default}
                alt={pokemon.name}
                className="w-24 h-24 mx-auto"
            />
            <p className="text-sm">
                <strong>Tipos:</strong> {pokemonTypes.join(", ")}
            </p>
        </div>
    );
};

export default TipoCard;
