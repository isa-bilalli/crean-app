import { Link, useLocation } from "react-router-dom";
import PowerOff from "../assets/PowerOff.svg"
import Back from "../assets/Back.svg"

function Header() {
    const location = useLocation();
    const isDashboard = location.pathname === "/dashboard";

    return(
        <header className="bg-gray-800 text-white h-25 items-center flex justify-between min-w-screen">
            <h2 className="text-mono tracking-widest text-4xl text-center font-bold mb-2 p-4 select-none">CreAN Management</h2>
            <div className="flex flex-row">
                <p className='text-xl mt-6'>Admin</p>
                {isDashboard ? (
                    <Link to={"/"}>
                        <img src={PowerOff} alt='Log Out icon' className='h-12 w-12 m-4 ml-6 p-1 rounded-full scale-130 hover:scale-140 hover:bg-gray-700 active:scale-125 select-none'/>
                    </Link>
                ) : (
                    <Link to={"/dashboard"}>
                        <img src={Back} alt='Back icon' className='h-12 w-12 m-4 ml-6 p-1 rounded-full scale-130 hover:scale-140 hover:bg-gray-700 active:scale-125 select-none'/>
                    </Link>
                )}
            </div>
        </header>
    )
}

export default Header;