function createNav() {
    let nav = document.querySelector('.navbar') ;

    nav.innerHTML = `
    <div class="nav">
        <img src="../static/images/groccery_logo.png" class="brand-logo" alt="" th:src="@{images/groccery_logo.png}"/>
        <div class="nav-items">
            <div class="search">
                <input type="text" class="search-box" placeholder="search for vegetables and other products">
                <button class="search-btn">search</button>
            </div>
            <a href="#"><img src="../static/images/profilelogo.jpg"  alt="" th:src="@{images/profilelogo.jpg}"/></a>
            <a href="#"><img src="../static/images/cartlogo.png"  alt="" th:src="@{images/cartlogo.png}"/></a>
        </div>

    </div>
    <ul class="links-container">
        <li class="link-item"><a href="vegetables.html" class="link">Vegetables</a></li>
        <li class="link-item"><a href="fruits.jsp" class="link">Fruits</a></li>
        <li class="link-item"><a href="fgs.jsp" class="link">Food grains and spices</a></li>
        <li class="link-item"><a href="dairy.jsp" class="link">Dairy </a></li>
        <li class="link-item"><a href="beverages.jsp" class="link">Beverages</a></li>
        <li class="link-item"><a href="snacks.jsp" class="link">snacks</a></li>
        <li class="link-item"><a href="dryfruits.jsp" class="link">Dry fruits</a></li>
        <li class="link-item"><a href="cleaning.jsp" class="link">cleaning </a></li>
    </ul>
    `;
}

createNav();