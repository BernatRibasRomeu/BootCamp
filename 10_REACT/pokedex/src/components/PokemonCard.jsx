import React, { useState, useEffect } from "react";

function PokemonCard({ pokemonId }) {
    const [pokemon, setPokemon] = useState(null);
    const [loading, setLoading] = useState(true);

    useEffect(() => {
        const fetchPokemon = async () => {
            try {
                const response = await fetch(
                    `https://pokeapi.co/api/v2/pokemon/${pokemonId}`
                );
                if (!response.ok) {
                    throw new Error("No se pudo obtener el Pokémon.");
                }
                const data = await response.json();
                setPokemon(data);
            } catch (error) {
                console.error(error);
            } finally {
                setLoading(false);
            }
        };

        fetchPokemon();
    }, [pokemonId]);

    if (loading) return <p className="text-center">Cargando...</p>;

    if (!pokemon) return <p className="text-center">Error al cargar el Pokémon.</p>;

    const { id, name, sprites, types } = pokemon;

    return (
        <div className="border border-gray-300 rounded-lg shadow-md p-4 text-center">
            <h2 className="text-lg font-bold">
                #{id} {name.charAt(0).toUpperCase() + name.slice(1)}
            </h2>
            <img
                src={sprites.front_default}
                alt={name}
                className="w-24 h-24 mx-auto"
            />
            <p className="text-sm">
                <strong>Tipo:</strong> {types.map((t) => t.type.name).join(", ")}
            </p>
        </div>
    );
}

export default PokemonCard;
