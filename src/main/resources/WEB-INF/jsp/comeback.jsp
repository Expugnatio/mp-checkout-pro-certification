<!doctype html>
<html lang="en"
      xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org">

<head th:replace="main :: head"/>
<body>

<script src="https://www.mercadopago.com/v2/security.js" view="checkout"></script>

<header th:replace="main :: header"/>

<div class="d-md-flex flex-md-equal w-100 my-md-3 ps-md-3">
    <div class="bg-dark me-md-3 pt-3 px-3 pt-md-5 px-md-5 text-center overflow-hidden">
        <div class="my-3 py-3 text-white">
            <h2 class="display-5">Tu Pago Se Encuentra En Estado ... !</h2>
            <p class="lead">Celular ...</p>
        </div>
        <div class="bg-light shadow-sm mx-auto text-black" style="width: 80%; height: 300px; border-radius: 21px 21px 0 0;">
            <a id="mp-pay" class="btn btn-outline-secondary" href="#"> </a>
        </div>
    </div>
    <!--<div class="bg-light me-md-3 pt-3 px-3 pt-md-5 px-md-5 text-center overflow-hidden">
        <div class="my-3 p-3">
            <h2 class="display-5">Another headline</h2>
            <p class="lead">And an even wittier subheading.</p>
        </div>
        <div class="bg-dark shadow-sm mx-auto" style="width: 80%; height: 300px; border-radius: 21px 21px 0 0;"></div>
    </div> -->
</div>

<footer th:insert="main :: footer"></footer>
</body>
</html>