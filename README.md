# 👨‍💻 Delon Borges - Portfolio Website

## 🗂 About the Project

Professional personal portfolio developed with **Kotlin and Ktor framework**, focusing on performance, accessibility and SEO. The website presents information about professional experience, education and projects by Delon Borges, a Software Engineer specialized in backend development. Built as a server-side rendered web application using modern backend technologies.

## 🚀 Implemented Improvements

### 🔍 SEO and Metadata
- **Open Graph and Twitter meta-tags**: Optimization for social media sharing
- **Structured Data (JSON-LD)**: Schema.org markup for better search engine indexation
- **Essential meta tags**: Keywords, author, robots, enhanced description
- **Favicon**: Custom icon for the website

### ♿ Accessibility
- **Skip navigation**: Link to jump to the main content
- **Aria labels**: Better description for assistive technologies
- **Alt texts**: More detailed descriptions for images
- **Semantic navigation**: More accessible HTML structure

### ⚡ Performance
- **Font preloading**: Optimized loading of Fira Sans font
- **Lazy loading**: Optimized image loading
- **Image dimensions**: Width/height attributes to prevent layout shifts

### 🏗️ Structure and Organization
- **Semantic code**: More structured and meaningful HTML
- **Modular CSS**: Maintained and improved organization
- **Responsiveness**: Maintained and optimized responsive design

---

## 💾 Technologies

### Backend
- [Kotlin](https://kotlinlang.org/) 2.2.20 - Programming language
- [Ktor](https://ktor.io/) 3.3.0 - Web application framework
- [Netty](https://netty.io/) - High-performance HTTP server engine
- [Gradle](https://gradle.org/) - Build automation and dependency management

### Frontend (Server-Side Rendered)
- [kotlinx.html](https://github.com/Kotlin/kotlinx.html) - Type-safe HTML builders
- [HTML5](https://developer.mozilla.org/en-US/docs/Web/HTML) - Semantic structure
- [CSS3](https://developer.mozilla.org/en-US/docs/Web/CSS) - Responsive styling
- [Google Fonts](https://fonts.google.com/) - Typography (Fira Sans)

### Infrastructure & Logging
- [Logback](http://logback.qos.ch/) - Logging framework
- [YAML Configuration](https://yaml.org/) - Application configuration

---

## 🛠️ Project Structure

```
delonborges-website/
├── build.gradle.kts                        # Gradle build configuration
├── settings.gradle.kts                     # Gradle settings
├── gradle.properties                       # Gradle properties
├── src/
│   └── main/
│       ├── kotlin/                         # Kotlin source code
│       │   ├── Application.kt              # Main application entry point
│       │   ├── Routing.kt                  # HTTP routing configuration
│       │   ├── models/
│       │   │   └── Portfolio.kt            # Data models (PersonalInfo, Experience, etc.)
│       │   ├── services/
│       │   │   └── PortfolioService.kt     # Business logic and data provider
│       │   └── templates/
│       │       └── PortfolioTemplate.kt    # HTML template generation
│       └── resources/
│           ├── application.yaml            # Application configuration
│           ├── logback.xml                 # Logging configuration
│           └── assets/                     # Static resources
│               ├── images/                 # Images and icons
│               └── styles/                 # Modular CSS files
│                   ├── style.css           # Main import file
│                   ├── global.css          # Global styles and reset
│                   ├── header.css          # Header styles
│                   ├── introduction.css    # Introduction styles
│                   ├── experience.css      # Experience section styles
│                   ├── education.css       # Education section styles
│                   └── footer.css          # Footer styles
├── gradle/                                 # Gradle wrapper
└── README.md                               # Project documentation
```

---

## ✅ Development Standards

- [Conventional Commits](https://www.conventionalcommits.org/en/v1.0.0/)
- [Branch Naming Convention](https://deepsource.io/blog/git-branch-naming-conventions/)
- [Semantic HTML](https://developer.mozilla.org/en-US/docs/Web/HTML/Element)
- [WCAG Guidelines](https://www.w3.org/WAI/WCAG21/quickref/)

---

## 🚀 Deploy and Hosting

- [Railway](https://railway.com/)
- [Cloudflare](https://www.cloudflare.com)

---

*Project developed with a focus on web development best practices, accessibility and performance.*
