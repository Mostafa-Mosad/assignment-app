import './App.css';

function App() {
  fetch('api/auth/login', {
    headers: {
      "Content-Type": "application/json"
    },
    method: "post",
    body: JSON.stringify({
      "username": "Mosad",
      "password": "Mosad123"
    })
  })
  return (
    <div className="App">
      <h1>Assignment APP.</h1>
    </div>
  );
}

export default App;
