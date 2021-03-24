import React from "react"

function Skill(props){
    return (
        <div>
            <h3 style={{color: props.color}}>{props.title}</h3>
            <p>{props.description}</p>
        </div>
    )
}

export default Skill