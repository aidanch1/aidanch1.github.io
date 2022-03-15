import React from "react"
import Skill from "./Skill"
import Project from "./ProjectButton"

function CSection(){
    return (
        <div className={"d-flex flex-row justify-content-start"}>
            <Skill
            title="C"
            description="I've gained experience in C and C++ through projects in class"
            color="#00589d"
            />
            <Project
            image="/project-thumbnails/freeblock.png"
            name="Dynamic Memory Allocator"
            description="Implemented a memory allocator using an explicit free list, supporting malloc and free functionality. 
            Achieved on average 84% space utilization and matched the speed of the malloc library"
            />
        </div>
    )
}

export default CSection