
import axios from 'axios';

export default axios.create({
    baseURL:'https://0c25-2603-7000-dd00-1ba3-95b2-ce0d-85e4-98dc.ngrok-free.app',
    headers: {"ngrok-skip-browser-warning": "true"}
});