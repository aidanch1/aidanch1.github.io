import React from "react"
import { Link } from "react-router-dom"

const postData = require("./Posts/posts.json")

function Blog(){
    const posts = postData.map(post => {
        return (
            <Link to={"/post/" + post.slug} key={post.slug} className="post-link">
                <div className="row justify-content-between">
                    <div className="col-10">
                        <h5>{post.title}</h5>
                        <p>{post.date}</p>
                    </div>
                    <h1 className="col-2">&#10095;</h1>
                </div>
            </Link>
        );
    });
    return (
        <div className="container d-flex flex-column">
            {posts}
        </div>
    )
}

export default Blog