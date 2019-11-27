$(function (){
    $('#frm-registroP').validate()({
        rules: {
            DNI: {
                requeried: true
            },
            Clave: {
                requeried: true
            },
            Nombres: {
                requeried: true
            },
            Primer_Apellido: {
                requeried: true
            },
            Segundo_Apellido: {
                requeried: true
            },
            Foto: {
                requeried: true
            },
            Fecha_Nacimiento: {
                requeried: true
            },
            Direccion: {
                requeried: true
            },
            Estado_Civil: {
                requeried: true
            },
            Sexo: {
                requeried: true
            },
            Participante: {
                requeried: true
            }
        },
        messages: {
            DNI: {
//                requeried: document.getElementById("m1").style.display = 'block',
//                reqieried: document.getElementById("m1").style.color = 'red'
            },
            Clave: {
                //requeried: document.getElementById("m2").style.display = 'block',
                //reqieried: document.getElementById("m2").style.color = 'red'
            },
            Nombres: {
                //requeried: document.getElementById("m3").style.display = 'block',
                //reqieried: document.getElementById("m3").style.color = 'red'
            },
            Primer_Apellido: {
                //requeried: document.getElementById("m4").style.display = 'block',
                //reqieried: document.getElementById("m4").style.color = 'red'
            },
            Segundo_Apellido: {
                //requeried: document.getElementById("m5").style.display = 'block',
                //reqieried: document.getElementById("m5").style.color = 'red'
            },
            Foto: {
                //requeried: document.getElementById("m6").style.display = 'block',
                //reqieried: document.getElementById("m6").style.color = 'red'
            },
            Fecha_Nacimiento: {
                //requeried: document.getElementById("m7").style.display = 'block',
                //reqieried: document.getElementById("m7").style.color = 'red'
            },
            Direccion: {
                //requeried: "El campo Direccion es obligatorio"
            },
            Estado_Civil: {
                //requeried: "El campo Estado Civil es obligatorio"
            },
            Sexo: {
                //requeried: "El campo Sexo es obligatorio"
            },
            Participante: {
               // requeried: "El campo Participante es obligatorio"
            }

        },
        submitHandler: function (form) {
            var data = $('#frm-registroP').serialize();
            $.post("registrar", data, function (res, est, jqXHR) {
                alert(res);
                alert();
            });
//                form.submit();
        }
    });
    $("#frm-login").validate()({
        rules: {           
            DNI: {
                requeried: true
//                minlength: 8,
//                maxlengty: 9
            },
            Clave: {
                requeried: true
            }
        },
        messages: {
            DNI: {                
                //requeried: "El usuario es obligatorio"
//                requeried: document.getElementById("DNI").style.display = 'block',
//                reqieried: document.getElementById("DNI").style.color = 'red'
            },
            Clave: {
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
                if(res=='1'){
                    alert("Bienvenido, presione aceptar para ser redireccionado al panel principal");
                    setTimeout(function(){
                        window.location="panel.jsp";
                    },300);
                }else{
                    alert("Credenciales incorrectas");
                }
            });
            form.submit();
        }
    });
});
    
    