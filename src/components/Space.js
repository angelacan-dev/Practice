import React, { useState, useEffect } from "react";

// https://api.nasa.gov/planetary/apod?api_key=RIazqmy0Ahesy6FP2ZeeTEoquBQsjqCRaarQMCLu&date=2021-09-18

const api = {
  key: "RIazqmy0Ahesy6FP2ZeeTEoquBQsjqCRaarQMCLu",
  base: "https://api.nasa.gov/planetary/apod",
};

function Space() {
  const [space, setSpace] = useState();

  useEffect(() => {
    fetch(`${api.base}?api_key=${api.key}`)
      .then((res) => res.json())
      .then((data) => setSpace(data))
      .catch((error) => console.log(error));
  }, []);

  return (
    <div>
      <h1>Space Component</h1>
      <img src={space.hdurl} />
      <h1>{space.title}</h1>
      <h2>{space.explanation}</h2>
      <h3>{space.date}</h3>
    </div>
  );
}

export default Space;
