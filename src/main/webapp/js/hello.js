console.log("xin chào");
// fetch('https://jsonplaceholder.typicode.com/todos/1')
//     .then(response => response.text())
//     .then(json => console.log(json)
import axios from "axios";
const data =axios.get('https://jsonplaceholder.typicode.com/todos/1');
console.log(data)