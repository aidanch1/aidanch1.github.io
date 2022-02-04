import React from "react"
import Skill from "./Skill"
import Project from "./ProjectButton"

function CSection(){
    return (
        <div className={"d-flex flex-row justify-content-start w-50"}>
            <Skill
            title="C"
            description="Took a class and know basics of C and kind of assembly, not an expert but its a useful skill so I'm shoving it here >:)"
            color="#00589d"
            />
        </div>
    )
}

export default CSection