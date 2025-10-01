package com.delonborges.templates.styles

import kotlinx.html.HEAD
import kotlinx.html.style
import kotlinx.html.unsafe

object IntroductionStyle {
    fun render(head: HEAD) {
        head.style {
            unsafe {
                +"""
                /* Introduction Styles */
                .introduction {
                    max-width: 1200px;
                    padding: 40px 20px;
                    margin: 0 auto;
                    display: grid;
                    grid-template-columns: 1fr 2fr;
                    gap: 100px;
                    align-items: center;
                }

                .introduction h1 {
                    font-size: 4.5rem;
                    line-height: 1.125;
                    margin-bottom: 30px;
                    position: relative;
                }

                .introduction h1::before {
                    content: "";
                    display: block;
                    width: 130px;
                    height: 100px;
                    background: url('/assets/images/lines.svg') no-repeat center;
                    position: absolute;
                    top: -15px;
                    left: -40px;
                    z-index: -1;
                }

                .introduction p {
                    font-size: 1.5rem;
                    color: #525252;
                }

                .introduction p a {
                    text-decoration: none;
                    color: #141414;
                }
                """.trimIndent()
            }
        }
    }
}
