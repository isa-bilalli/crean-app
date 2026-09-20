import { NavLink } from "react-router-dom";

function Login() {

    return(
        <div className="flex justify-center items-center h-screen bg-gray-950">
            <div className="flex flex-col text-white border border-gray-800 rounded-xl items-center">
                <h1 className="font-mono text-2xl mt-5 mx-15 mb-5 tracking-widest">CreAN Managment</h1>
                <input type="text" placeholder="Username" className="border-2 border-gray-900 p-1 focus:border-gray-800 outline-none mb-3"></input>
                <input type="password" placeholder="Password" className="border-2 border-gray-900 p-1 focus:border-gray-800 outline-none mb-2"></input>
                <button className="border-2 border-gray-900 m-2 px-2 hover:scale-103 transition-transform duration-75 active:scale-99">Log In</button>
                <p className="min-h-9"></p>
                <NavLink to={"/dashboard"}>test</NavLink>
            </div>
        </div>
    )
}

export default Login;