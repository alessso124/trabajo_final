////$(function () {
////    $('#frm-Login').validate({
////        rule: {
////            DNI: {
////                requeried: true
////            },
////            Clave: {
////                requeried: true
////            }
////        },
////        messages: {
////            DNI: {
////                requeried: document.getElementById("m1").style.display = 'block',
////                reqieried: document.getElementById("m1").style.color = 'red'
////            },
////            Clave: {
////                requeried: document.getElementById("m2").style.display = 'block',
////                reqieried: document.getElementById("m2").style.color = 'red'
////            },
////            
////            submitHandler: function (form) {
////                var data=$("#frm-Login").Serializable();
////                $.post("LoginPersona",data,function(res,est,jqXHR){
////                   alert(res); 
////                });
//////                form.submit();
////            }
////        }
////    })
////});
//$(function () {
//$("#frm-login").validate({
//    rule: {
//        DNI: {
//            requeried: true
//        },
//        Clave: {
//            requeried: true
//        }
//    },
//    messages: {
//        DNI: {
//            requeried:"El usuario es obligatorio"
////            requeried: document.getElementById("DNI").style.display = 'block',
////            reqieried: document.getElementById("DNI").style.color = 'red'
//        },
//        Clave: {
//            requeried:"La clave es obligatoria"
////            requeried: document.getElementById("Clave").style.display = 'block',
////            reqieried: document.getElementById("Clave").style.color = 'red'
//        },
//        submitHandler: function (form) {
//            
//                alert();
////            var data = $("#frm-login").Serializable();
////            $.post("login", data, function (res, est, jqXHR) {
////                //alert(res);
////                window.alert(res);
////            });
////                form.submit();
//        }
//
//    }
//
//
//})
//});

$(function () {
            $("#frm-login").validate({
        rules : {           
            DNI : {
                requeried: true
//                minlength: 8,
//                maxlengty: 9
            },
            Clave : {
                requeried: true
            }
        },
        messages : {
            DNI : {                
                //requeried: "El usuario es obligatorio"
//                requeried: document.getElementById("DNI").style.display = 'block',
//                reqieried: document.getElementById("DNI").style.color = 'red'
            },
            Clave : {
                //requeried: "La clave es obligatoria"
//                requeried: document.getElementById("Clave").style.display = 'block',
//                reqieried: document.getElementById("Clave").style.color = 'red'
            }
        },
        submitHandler: function (form) {
            var data = $("#frm-login").serialize();
            $.post("login", data, function (res, est, jqXHR) {
                //alert(res);
                alert(res);
            });
            form.submit();
        }
    });
    });