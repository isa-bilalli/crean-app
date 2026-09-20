import { NavLink } from "react-router-dom";
import Forward from "../assets/Forward.svg"

export type CardProps = {
    link:string,
    icon:string,
    title:string,
}

function Card(props: CardProps) {

    return(
        <NavLink to={props.link}>
            <div className="bg-white mt-5 ml-5 p-5 rounded-xl hover:scale-105 transition-transform flex flex-col items-center w-40 active:scale-95 border-3 border-gray-800">
                <img src={props.icon} className='mb-2 pointer-events-none select-none'/>
                <h1 className='font-semibold'>{props.title}</h1>
                <img src={Forward} className='pointer-events-none select-none'/>
            </div>
        </NavLink>
    )
}

export default Card;