package com.delonborges.templates.styles

import kotlinx.html.HEAD
import kotlinx.html.style
import kotlinx.html.unsafe

object ResponsiveStyle {
    fun render(head: HEAD) {
        head.style {
            unsafe {
                +"""
                /* Mobile and Responsive Styles */
                @media (max-width: 800px) {
                    .subtitle {
                        font-size: 3rem;
                        text-transform: capitalize;
                        max-width: initial !important;
                    }

                    .header {
                        flex-direction: column;
                        gap: 40px;
                        padding: 20px;
                    }

                    .header a {
                        background: #f5f5f5;
                        border-radius: 4px;
                    }

                    .introduction {
                        grid-template-columns: 1fr 1fr;
                        gap: 40px;
                    }

                    .introduction h1 {
                        font-size: 2rem;
                        margin-bottom: 10px;
                    }

                    .introduction h1::before {
                        width: 30px;
                        height: 10px;
                        left: 0;
                    }

                    .introduction p {
                        font-size: 1rem;
                    }

                    .experience {
                        grid-template-columns: 1fr;
                        gap: 40px;
                    }

                    .experience .subtitle {
                        color: #141414;
                    }

                    .experience-text {
                        font-size: 1.25rem;
                    }

                    .company-year {
                        position: initial;
                        order: 1;
                        width: initial;
                        text-align: left;
                    }

                    .education-container {
                        grid-template-columns: 1fr;
                        gap: 40px;
                    }

                    .education .subtitle {
                        color: #ffffff;
                    }

                    .education-text {
                        font-size: 1.25rem;
                    }

                    .footer-container {
                        grid-template-columns: 1fr;
                        gap: 20px;
                    }

                    .footer-contact {
                        font-size: 1.25rem;
                    }
                }

                @media (max-width: 1000px) {
                    .introduction h1 {
                        font-size: 3rem;
                    }
                }

                @media (max-width: 400px) {
                    .introduction {
                        grid-template-columns: 1fr;
                    }

                    .introduction img {
                        display: none;
                    }
                }
                """.trimIndent()
            }
        }
    }
}
