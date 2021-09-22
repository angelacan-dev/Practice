import "./App.css";
import React from "react";
import Space from "./components/Space";

function App() {
  return (
    <main>
      <div className="about">
        <h1>Hi,Welcome to Angela's Spacestagram!</h1>
        <br />
        Search below to view the picture of the day
      </div>
      <Space />
    </main>
  );
}

export default App;
