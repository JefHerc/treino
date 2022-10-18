const qtdAcompanhantes = document.querySelector('#quantidade-acompanhantes');
const btnAdd = document.querySelector('.btn');
const form = document.querySelector('.form-inline');

const adicionar = btnAdd.addEventListener('click', function(e) {
	alert('Só é permitido até 3 acompanhantes por convidado');

	e.preventDefault();
	window.alert('Só é permitido até 3 acompanhantes por convidado');

	if (Number(qtdAcompanhantes.textContent) > 3) {
		window.alert('Só é permitido até 3 acompanhantes por convidado');
		qtdAcompanhantes.textContent = ""
	} else {
		form.submit();
	}
});