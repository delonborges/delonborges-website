package com.delonborges.templates.styles

import kotlinx.html.HEAD
import kotlinx.html.style
import kotlinx.html.unsafe

object EducationStyle {
    fun render(head: HEAD) {
        head.style {
            unsafe {
                +"""
                /* Education Styles */
                .education {
                    background: #141414;
                    color: #e0e0e0;
                }

                .education-container {
                    max-width: 1200px;
                    padding: 120px 20px;
                    margin: 0 auto;
                    display: grid;
                    grid-template-columns: 1fr 2fr;
                    gap: 100px;
                    position: relative;
                }

                .education-container::after {
                    content: "";
                    display: block;
                    width: 130px;
                    height: 100px;
                    background: url("/assets/images/lines.svg") no-repeat center;
                    position: absolute;
                    bottom: -50px;
                    left: 20px;
                }

                .education .subtitle {
                    color: #000000;
                    max-width: 5ch;
                }

                .education-text {
                    font-size: 1.5rem;
                    line-height: 1.33;
                    max-width: 50ch;
                    margin-bottom: 60px;
                    color: #a3a3a3;
                }

                .education-text strong {
                    color: #ffffff;
                }

                .education-list {
                    display: flex;
                    flex-wrap: wrap;
                    gap: 20px;
                    margin-bottom: 60px;
                }

                .education-item {
                    flex: 1;
                    background: #000000;
                    padding: 20px;
                    border-radius: 4px;
                    display: flex;
                    flex-direction: column;
                }

                .education-type {
                    font-size: .875rem;
                    text-transform: uppercase;
                    color: #a3a3a3;
                    margin-bottom: 10px;
                }

                .education-course {
                    flex: 1;
                    font-size: 1.125rem;
                    line-height: 1.4;
                    margin-bottom: 40px;
                    position: relative;
                }

                .education-course::before {
                    content: '';
                    display: block;
                    width: 4px;
                    height: 20px;
                    background: linear-gradient(#f24f00, #d13100);
                    position: absolute;
                    left: -24px;
                }

                .education-institute {
                    font-size: 1.125rem;
                    color: #a3a3a3;
                }

                .education-extra-courses,
                .education-extra-courses-projects {
                    margin-bottom: 60px;
                }

                .education-extra-courses-projects a {
                    color: #ffffff;
                }

                .education-extra h3 {
                    font-size: 0.875rem;
                    line-height: 1.4;
                    text-transform: uppercase;
                    color: #8f8f8f;
                    margin-bottom: 30px;
                }

                .education-extra li {
                    font-size: 1.125rem;
                    line-height: 1.1;
                    margin-bottom: 20px;
                }

                .education-extra span {
                    color: #8f8f8f;
                }

                .languages {
                    display: flex;
                    flex-wrap: wrap;
                    gap: 10px;
                    align-content: start;
                }

                .languages li {
                    font-size: 0.875rem;
                    line-height: 1.4;
                    border-radius: 4px;
                    background: #ffffff;
                    padding: 5px 10px;
                    color: #141414;
                }
                """.trimIndent()
            }
        }
    }
}
