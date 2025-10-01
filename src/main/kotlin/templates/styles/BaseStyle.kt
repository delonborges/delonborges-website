package com.delonborges.templates.styles

import kotlinx.html.HEAD
import kotlinx.html.style
import kotlinx.html.unsafe

object BaseStyle {
    fun render(head: HEAD) {
        head.style {
            unsafe {
                +"""
                /* Global Base Styles */
                body {
                    font-family: 'Fira Sans', Arial, sans-serif;
                    margin: 0;
                    color: #141414;
                    background-color: #cccccc;
                }

                .skip-link {
                    position: absolute;
                    top: -40px;
                    left: 6px;
                    background: #141414;
                    color: white;
                    padding: 8px;
                    text-decoration: none;
                    border-radius: 4px;
                    font-size: 0.875rem;
                    z-index: 1000;
                    transition: top 0.3s;
                }

                .skip-link:focus {
                    top: 6px;
                }

                h1, h2, h3, p {
                    margin: 0;
                }

                ul {
                    margin: 0;
                    padding: 0;
                    list-style: none;
                }

                img {
                    max-width: 100%;
                    height: auto;
                    display: block;
                }

                .subtitle {
                    font-size: 8rem;
                    line-height: 1;
                    text-transform: uppercase;
                    word-break: break-all;
                    max-width: 4ch;
                }
                """.trimIndent()
            }
        }
    }
}
