<template>
  <section class="info">
    <div class="name">
      <h1>
        Delon Barbosa Borges
      </h1>
      <div class="intro-text">
        <h6>
          Learning and improving my skills as:
        </h6>
        <h5>
          Tester, developer, husband & father!
        </h5>
      </div>
    </div>
    <div class="social">
      <div class="details">
        <img alt="GitHub" class="icons" src="../assets/images/contact/github.svg"/>
        <a href="https://github.com/delonborges" rel="noopener noreferrer"
           target="_blank">github.com/delonborges</a>
      </div>
      <div class="details">
        <img alt="Linkedin" class="icons" src="../assets/images/contact/linkedin.svg"/>
        <a href="https://www.linkedin.com/in/delonborges/" rel="noopener noreferrer"
           target="_blank">linkedin.com/in/delonborges</a>
      </div>
    </div>
    <div class="contact">
      <div class="details">
        <img alt="Address" class="icons" src="../assets/images/contact/map-pin.svg"/>
        <a href="https://www.google.com/maps/place/São+Leopoldo,+RS/@-29.7510572,-51.2131741,12z/data=!3m1!4b1!4m5!3m4!1s0x951968315942f59b:0x1b4734205177f47c!8m2!3d-29.7549941!4d-51.150283"
           rel="noopener noreferrer"
           target="_blank">São
          Leopoldo - RS</a>
      </div>
      <div class="details">
        <img alt="E-mail" class="icons" src="../assets/images/contact/mail.svg"/>
        <a href="mailto:delon&#64;delonborges.com" rel="noopener noreferrer"
           target="_blank">delon.borges(@)icloud.com</a>
      </div>
    </div>
  </section>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.name {
  text-align: center;
  font-size: 3rem;
}

.social, .contact {
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
}

.details {
  padding: 0 12px;
}

a, .icons {
  vertical-align: middle;
  padding: 2px;
}


.intro-text {
  line-height: 0;
  padding: 24px;
  font-size: 1.5rem;
}

@media only screen and (max-width: 1024px) {
  .name {
    font-size: 2.2rem;
  }

  .intro-text {
    font-size: 1.2rem;
  }
}

@media only screen and (max-width: 768px) {
  .social, .contact {
    font-size: 0.8rem;
  }

  .icons {
    width: 20px;
    height: 20px;
  }
}

@media only screen and (max-width: 480px) {
  .name {
    font-size: 1rem;
  }

  .intro-text {
    font-size: 0.6rem;
  }
}

@media only screen and (max-width: 320px) {
  .name {
    font-size: 0.8rem;
  }

  .social, .contact {
    font-size: 0.6rem;
  }

  .icons {
    width: 16px;
    height: 16px;
  }

  .intro-text {
    margin: 0;
    padding: 20px 0;
    font-size: 0.5rem;
  }
}
</style>
