import React from "react";
import ReactMarkdown from "react-markdown"
 
class Post extends React.Component {
    constructor(){
        super()
        this.state = {
            md: ''
        }
    }
    async componentDidMount() {
        var slug = this.props.match.params.slug;
        const file = await import(`./Posts/${slug}.md`);
        const response = await fetch(file.default);
        const text = await response.text();

        this.setState({
            md: text
        })
    }
    render() {
        return (
            <div className="post container">
                <ReactMarkdown children={this.state.md}/>
            </div>
        )
    }
}

export default Post