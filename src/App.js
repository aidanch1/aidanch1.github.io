import React from "react"
import Socials from "./components/Socials"
import Info from "./components/Info"
import JavaSection from "./components/JavaSection"
import NodejsSection from "./components/NodejsSection"
import HtmlSection from "./components/HtmlSection"
import ReactSection from "./components/ReactSection"

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
        <div className={"main-area" + (this.state.introNotDone ? " hidden" : "")}>
          <Socials />
          <Info />
          <div className="d-flex justify-content-around">
            <JavaSection />
            <NodejsSection />
            <HtmlSection />
            <ReactSection />
          </div>
        </div>
      </main>
    )
  }
}

export default App;
