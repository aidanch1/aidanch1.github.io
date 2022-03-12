import React from "react"
import Skill from "./Skill"
import Project from "./ProjectButton"

function PythonSection(){
    return (
        <div className={"d-flex flex-row justify-content-start w-50"}>
            <Skill
                title="Python"
                description="I'm planning on building some bigger projects soon."
                color="#3474a5"
            />
            <Project 
                image="/project-thumbnails/numpy.png"
                name="Classwork"
                description="Learned and implemented probabilistic data strucutures such as Bayseian filters, Bloom filters, and distinct element estimation.
                Learned how to use simulations to solve the knapsack and multi-armed bandits problem"
            />
            <Project 
                image="/project-thumbnails/LeetCode_logo_black.png"
                link="https://leetcode.com/aidanch1/"
                name="LeetCode"
                description="Competed in 14 coding contests, achieving a rating of 1913 (top 3%) and Knight Badge."
            />
        </div>
    )
}

export default PythonSection