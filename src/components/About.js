import React from "react"
import LogoLink from "./LogoLink"
import Age from "./Age"

function About(){
    return (
        <div className="about container">
            <div className="aboutrow row">
                <div className="col-md-auto">
                    <img className="aboutSelfPicture" src="/self-picture-300x291px.png" alt=""></img>
                </div>
                <div className="col">
                    <h3>
                        Name: Aidan Chen <br />
                        Year: Sophomore <br />
                        Age: <Age /> years
                    </h3>
                    <h4>
                        Hobbies: 
                        <ul>
                            <li>Chess (Add me!) 
                                <LogoLink link="https://www.chess.com/member/potatershshh"
                                logo="/chess.com-Logo.png"/>
                                <LogoLink link="https://lichess.org/@/POtatershshh"
                                logo="/lichess-Logo.png"/>
                            </li>
                            <li>Playing games (currently genshin, bedwars). Also party games with friends</li>
                            <li>Watching anime, my favorite shows are Your Lie in April and Steins;Gate</li>
                            <li>Doing stuff with my friends like swimming, biking, or shooting hoops</li>
                        </ul>
                    </h4> 
                </div>
            </div>
        </div>
    )
}

export default About