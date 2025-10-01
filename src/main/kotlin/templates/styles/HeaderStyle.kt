package com.delonborges.templates.styles

import kotlinx.html.HEAD
import kotlinx.html.style
import kotlinx.html.unsafe

object HeaderStyle {
    fun render(head: HEAD) {
        head.style {
            unsafe {
                +"""
                /* Header Styles */
                .header {
                    max-width: 1200px;
                    padding: 40px 20px;
                    margin: 0 auto;
                    display: flex;
                    justify-content: space-between;
                    align-items: center;
                }

                .header-menu {
                    display: flex;
                    flex-wrap: wrap;
                    gap: 10px;
                    justify-content: center;
                }

                .header-menu a {
                    font-size: 1.125rem;
                    line-height: 1.3;
                    padding: 10px 20px;
                    text-decoration: none;
                    color: #141414;
                    display: block;
                }
                """.trimIndent()
            }
        }
    }
}
