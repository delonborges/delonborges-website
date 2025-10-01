# 👨‍💻 Delon Borges - Portfolio Website

## 🗂 About the Project

Professional personal portfolio developed with **Kotlin and Ktor framework**, focusing on performance, accessibility and SEO. The website presents information about professional experience, education and projects by Delon Borges, a Software Engineer specialized in backend development. Built as a server-side rendered web application using modern backend technologies.

## 🚀 Implemented Features

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
- **Modular CSS**: Organized styling with dedicated style renderers
- **Responsiveness**: Responsive design implementation
- **Component-based architecture**: Modular renderers for different page sections

---

## 💾 Technologies

### Backend
- [Kotlin](https://kotlinlang.org/) 2.2.20 - Programming language
- [Ktor](https://ktor.io/) 3.3.0 - Web application framework
- [Netty](https://netty.io/) - High-performance HTTP server engine
- [Gradle](https://gradle.org/) - Build automation and dependency management

### Frontend (Server-Side Rendered)
- [kotlinx.html](https://github.com/Kotlin/kotlinx.html) 0.11.0 - Type-safe HTML builders
- [kotlin-css](https://github.com/JetBrains/kotlin-wrappers/tree/master/kotlin-css) 2025.9.11 - Type-safe CSS in Kotlin
- [HTML5](https://developer.mozilla.org/en-US/docs/Web/HTML) - Semantic structure
- [CSS3](https://developer.mozilla.org/en-US/docs/Web/CSS) - Responsive styling
- [Google Fonts](https://fonts.google.com/) - Typography (Fira Sans)

### Infrastructure & Logging
- [Logback](http://logback.qos.ch/) 1.5.18 - Logging framework
- [YAML Configuration](https://yaml.org/) - Application configuration

---

## 🛠️ Project Structure

```
delonborges-website/
├── build.gradle.kts                                # Gradle build configuration
├── settings.gradle.kts                             # Gradle settings
├── gradle.properties                               # Gradle properties
├── gradlew                                         # Gradle wrapper (Unix)
├── gradlew.bat                                     # Gradle wrapper (Windows)
├── LICENSE                                         # Project license
├── README.md                                       # Project documentation
├── build/                                          # Build output directory
│   ├── classes/                                    # Compiled classes
│   ├── distributions/                              # Distribution packages
│   ├── libs/                                       # Generated JAR files
│   └── resources/                                  # Processed resources
├── gradle/                                         # Gradle wrapper files
│   └── wrapper/
└── src/
    └── main/
        ├── kotlin/                                 # Kotlin source code
        │   ├── Application.kt                      # Main application entry point
        │   ├── models/                             # Data models
        │   │   ├── Portfolio.kt                    # Main portfolio data model
        │   │   ├── PersonalInfo.kt                 # Personal information model
        │   │   ├── Experience.kt                   # Professional experience model
        │   │   ├── Education.kt                    # Education information model
        │   │   ├── Course.kt                       # Course/certification model
        │   │   ├── Project.kt                      # Project information model
        │   │   └── Language.kt                     # Language proficiency model
        │   ├── routings/                           # HTTP routing configuration
        │   │   └── PortfolioRouting.kt             # Main portfolio routes
        │   ├── services/                           # Business logic layer
        │   │   └── PortfolioService.kt             # Portfolio data service
        │   └── templates/                          # HTML template generation
        │       ├── PortfolioTemplate.kt            # Main template orchestrator
        │       ├── renderers/                      # Component renderers
        │       │   ├── MetaTagsRenderer.kt         # SEO meta tags
        │       │   ├── ResourceLinksRenderer.kt    # External resources
        │       │   ├── StructuredDataRenderer.kt   # JSON-LD schema
        │       │   ├── SkipLinkRenderer.kt         # Accessibility navigation
        │       │   ├── HeaderRenderer.kt           # Page header
        │       │   ├── IntroductionRenderer.kt     # Personal introduction
        │       │   ├── ExperienceRenderer.kt       # Work experience
        │       │   ├── EducationRenderer.kt        # Education section
        │       │   ├── CoursesRenderer.kt          # Courses/certifications
        │       │   ├── ProjectsRenderer.kt         # Projects showcase
        │       │   ├── LanguagesRenderer.kt        # Language skills
        │       │   └── FooterRenderer.kt           # Page footer
        │       └── styles/                         # CSS styling components
        │           ├── BaseStyle.kt                # Base styling utilities
        │           ├── GlobalStyle.kt              # Global styles and reset
        │           ├── HeaderStyle.kt              # Header section styles
        │           ├── IntroductionStyle.kt        # Introduction styles
        │           ├── ExperienceStyle.kt          # Experience section styles
        │           ├── EducationStyle.kt           # Education section styles
        │           ├── FooterStyle.kt              # Footer styles
        │           └── ResponsiveStyle.kt          # Responsive design rules
        └── resources/
            ├── application.yaml                    # Application configuration
            ├── logback.xml                         # Logging configuration
            └── assets/                             # Static resources
                └── images/                         # Images and icons
                    ├── profile.png                 # Profile picture
                    ├── logo.svg                    # Website logo
                    ├── education.svg               # Education icon
                    ├── languages.svg               # Languages icon
                    ├── lines.svg                   # Decorative lines
                    └── projects.svg                # Projects icon
```

---

## 🚀 Getting Started

### Prerequisites
- **Java 17** or higher
- **Gradle** (included via wrapper)

### Running the Application

1. **Clone the repository**
   ```bash
   git clone git@github.com:delonborges/delonborges-website.git
   cd delonborges-website
   ```

2. **Run the application**
   ```bash
   ./gradlew run
   ```
   
   Or on Windows:
   ```cmd
   gradlew.bat run
   ```

3. **Access the application**
   - Open your browser and navigate to `http://localhost:8080`

### Building for Production

```bash
./gradlew build
```

The application will be packaged in `build/libs/` directory.

---

## 🏗️ Architecture

### Design Patterns
- **Model-View-Template (MVT)**: Separation of concerns with dedicated models, services, and templates
- **Component-based Rendering**: Modular renderers for different page sections
- **Service Layer**: Business logic encapsulated in service classes

### Key Components
- **Models**: Data classes representing portfolio information
- **Services**: Business logic and data provision
- **Templates**: HTML generation using kotlinx.html
- **Renderers**: Specialized components for different page sections
- **Styles**: CSS-in-Kotlin approach for styling using kotlin-css

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
