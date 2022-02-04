import React from "react"

function Skill(props){
    return (
        <div className={"column"}>
            <h3 style={{color: props.color}}>{props.title}</h3>
            <p>{props.description}</p>
        </div>
    )
}

export default Skill