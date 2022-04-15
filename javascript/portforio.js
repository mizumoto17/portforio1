pagetop//-ie-safari not
const pagetopBtn = document.querySelector("#pagetop");
pagetopBtn.addEventListener('click',() => {
  window.scrollTo({
    top: 0,
    behavior: "smooth"
  });
});


// $(function() {
//   let pagetopBtn = $('#pagetop');
//   pagetopBtn.hide();

//   pagetopBtn.click(function () {
//     $('body,html').animate({
//       scrolltop: 0
//     }, 500);
//     return false;
//   });
// });
