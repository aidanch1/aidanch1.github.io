import React from "react"

function LogoLink(props){
    return (
        <a className="mx-2" href={props.link} target="_blank" rel="noreferrer">
            <img src={props.logo} width="32px" height="32px" alt=""></img>
        </a>
    )
}

export default LogoLink