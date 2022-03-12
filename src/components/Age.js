import React from "react"

class Age extends React.Component {
    constructor() {
        super()
        this.state = {
            age: 0
        }
    }
    componentDidMount() {
        setInterval(() => {
            let age = (new Date()-new Date("2004/01/30"))/(1000*60*60*24*365.25)
            this.setState({time: age.toString().substring(0,12)})
        }, 50);
    }
    render() {
        return (
            <span>{this.state.time}</span>
        )
    }
}

export default Age