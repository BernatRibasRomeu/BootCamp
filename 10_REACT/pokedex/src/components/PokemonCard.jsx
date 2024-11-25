import React, { useState, useEffect } from "react";

function PokemonCard({ pokemonId }) {
    const [pokemon, setPokemon] = useState(null);
    const [loading, setLoading] = useState(true);

    useEffect(() => {
        // Llama a la PokeAPI
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

    if (loading) return <p>Cargando...</p>;

    if (!pokemon) return <p>Error al cargar el Pokémon.</p>;

    // Extraemos los datos necesarios
    const { id, name, sprites, types } = pokemon;

    return (
        <div style={styles.card}>
            <h2>
                #{id} {name.charAt(0).toUpperCase() + name.slice(1)}
            </h2>
            <img src={sprites.front_default} alt={name} style={styles.image} />
            <p>
                <strong>Tipo:</strong> {types.map((t) => t.type.name).join(", ")}
            </p>
        </div>
    );
}

// Estilos en línea para la carta
const styles = {
    card: {
        border: "1px solid #ccc",
        borderRadius: "8px",
        padding: "16px",
        textAlign: "center",
        width: "200px",
        boxShadow: "0px 4px 8px rgba(0, 0, 0, 0.1)",
        margin: "16px auto",
    },
    image: {
        width: "100px",
        height: "100px",
    },
};

export default PokemonCard;
