import React from "react"

class ProjectButton extends React.Component {
    constructor() {
        super()
        this.state = {
            activated: false,
            showbody: false
        }
        this.handleClick = this.handleClick.bind(this)
    }
    handleClick(){
        this.setState(function(prevState){
            return { activated: !prevState.activated }
        })
        //janky way to give the text a show delay because the box takes 500 ms to expand
        if (!this.state.activated){
            setTimeout(function(){
                this.setState({ showbody: this.state.activated })
            }.bind(this), 500)
        } 
        //but still hides the text with no delay
        else {
            this.setState({ showbody: false })
        }
    }
    render() {
        return (
            <button 
                className={"project my-4" + (this.state.activated ? " activated" : "")}
                style={{backgroundImage: `url( ${this.props.image} )`}}
                onClick={this.handleClick}
            >{!this.state.showbody ? this.props.name : 
            <div>
                <a href={this.props.link} target="_blank">{this.props.name}&#8599;</a>
                <p className="mt-1">{this.props.description}</p>
            </div>}
            </button>
        )
    }
}

export default ProjectButton