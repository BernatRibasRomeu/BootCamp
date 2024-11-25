import React from 'react';
import PokemonCard from '../src/components/PokemonCard';

function App() {
  return (
    <div style={{ textAlign: 'center' }}>
      <h1>PokeAPI React</h1>
      <PokemonCard pokemonId={1} /> {/* Cambia el ID para otro Pokémon */}
    </div>
  );
}

export default App;

