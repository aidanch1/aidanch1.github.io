import React from "react"
import Skill from "./Skill"
import Project from "./ProjectButton"

function NodejsSection(){
    return (
        <div className={"d-flex flex-row justify-content-start w-50"}>
            <Skill
                title="Node.JS"
                description={[<span key="1">I've made some multiplayer browser games using </span>, 
                <a href="https://expressjs.com/" target="_blank" rel="noreferrer" key="4" className="whitelink">Express</a>,
                <span key="5"> as the server and </span>,
                <a href="https://socket.io/docs/v3" target="_blank" rel="noreferrer" key="2" className="whitelink">Socket.IO</a>,
                <span key="3"> to handle communication. Also made a discord bot</span>]}
                color="forestgreen"
            />
            <Project 
                image="/project-thumbnails/rubiksrace.png"
                link="https://github.com/aidanch1/rubiksrace"
                name="Rubiks Race"
                description="An online version of Rubiks Race, a sliding puzzle where 2 players race to be the first to make a design. 
                Implemented the randomization algorithm and game logic"
            />
            <Project 
                image="/project-thumbnails/diepioripoff.png"
                link="https://github.com/aidanch1/diepioripoff"
                name="Multiplayer Tank Game"
                description="A .io style game where you play against others for the #1 spot on the leaderboards. 
                Implemented scrolling movement, shooting, collision logic, and random reward generation on the map"
            />
            <Project 
                image="/project-thumbnails/St._JerryPFP.png"
                link="https://github.com/aidanch1/Big-Brain-Jerry-discord-bot-"
                name="Price Checker"
                description={["Discord bot for Hypixel Skyblock that fetches auction and bazaar price data from Hypixel's public ",
                <a className="whitelink" href="https://api.hypixel.net/" target="_blank" rel="noreferrer">api</a>,
                " for items the user is interested in buying. Uses a fuzzyset to make it easier to use."]}
            />
        </div>
    )
}

export default NodejsSection