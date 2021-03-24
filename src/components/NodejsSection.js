import React from "react"
import Skill from "./Skill"
import Project from "./ProjectButton"

function NodejsSection(){
    return (
        <div className="column d-flex flex-column">
            <Skill
                title="Node.JS"
                description={["I've made some multiplayer browser games using ", 
                <a href="https://socket.io/docs/v3" target="_blank">Socket.IO</a>,
                " and made a couple discord bots. I'm intermediate but by no means an expert."]}
                color="forestgreen"
            />
            <Project 
                image="/project-thumbnails/rubiksrace.png"
                link="https://github.com/aidanch1/rubiksrace"
                name="Rubiks Race"
                description="An online version of Rubiks Race, a sliding puzzle where 2 players race to be the first to make a design."
            />
            <Project 
                image="/project-thumbnails/diepioripoff.png"
                link="https://github.com/aidanch1/diepioripoff"
                name="Multiplayer Tank Game"
                description="A .io style game where you play against others for the #1 spot on the leaderboards."
            />
            <Project 
                image="/project-thumbnails/St._JerryPFP.png"
                link="https://github.com/aidanch1/Big-Brain-Jerry-discord-bot-"
                name="Price Checker"
                description={["Discord bot for Hypixel Skyblock that fetches auction and bazaar price data from ",
                <a className="whitelink" href="https://api.hypixel.net/" target="_blank">Hypixel's public api</a>,
                " for items the user is interested in buying. Uses a fuzzyset to make it easier to use."]}
            />
        </div>
    )
}

export default NodejsSection