import React from "react"
import Socials from "./components/Socials"
import Navigation from "./components/Navigation"
import Main from "./components/Main"

const header = "aidanch1"

class App extends React.Component {
  constructor(){
    super()
    this.state = {
      header: "",
      introNotDone: true
    }
  }
  updateHeader(index){
    if (index <= header.length){
      this.setState({ header: header.substring(0, index) })
      let pause = (index === header.length-1) ? 350 : 100
      setTimeout(this.updateHeader.bind(this, index+1), pause)
    } else {
      this.setState({ introNotDone: false })
    }
  }
  componentDidMount(){
    this.updateHeader(0)
  }
  render(){
    return (
      <main>
        <h1 className={"intro text-center" + (this.state.introNotDone ? "" : " top")}>{this.state.header}</h1>
        <Navigation hide={this.state.introNotDone}/>
        <div className={"main-area" + (this.state.introNotDone ? " hidden" : "")}>
          <Socials />
          <Main />
        </div>
      </main>
    )
  }
}

export default App;
