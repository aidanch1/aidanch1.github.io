import React from "react"
import { NavLink } from "react-router-dom"
import Navbar from 'react-bootstrap/Navbar'
import Nav from 'react-bootstrap/Nav'

function Navigation(props) {
    return (
        <Navbar className={props.hide ? " hidden" : ""} expand="md" variant="dark">
            <Navbar.Toggle aria-controls="navlinks" />
            <Navbar.Collapse id="navlinks">
                <Nav.Link exact as={NavLink} to="/">Portfolio</Nav.Link>
                <Nav.Link exact as={NavLink} to="/about">About</Nav.Link>
                <Nav.Link exact as={NavLink} to="/blog">Blog</Nav.Link>
            </Navbar.Collapse>
        </Navbar>
    )
}

export default Navigation