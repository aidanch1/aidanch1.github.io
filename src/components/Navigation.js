import React from "react"
import { NavLink } from "react-router-dom"

function Navigation(props) {
    return (
        <nav className={props.hide ? " hidden" : ""}>
            <ul>
                <li><NavLink exact to='/'>Portfolio</NavLink></li>
                <li><NavLink exact to='/about'>About</NavLink></li>
                <li><NavLink exact to='/blog'>Blog</NavLink></li>
            </ul>
        </nav>
    )
}

export default Navigation