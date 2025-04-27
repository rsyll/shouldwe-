
document.getElementById('decideBtn').addEventListener('click', function() {
    const name = document.getElementById('nameInput').value.trim();
    const resultDiv = document.getElementById('result');
    const resultText = document.getElementById('resultText');
    const resultImage = document.getElementById('resultImage');
            
        if (name === '') {
            alert('Please enter a name first!');
            return;
        }
            
            document.querySelector('p').classList.add('hidden');
            document.getElementById('nameInput').classList.add('hidden');
            this.classList.add('hidden');
            
            
            resultText.textContent = `Deciding about ${name}...`;
            resultDiv.classList.remove('hidden');
            
            
            setTimeout(() => {
                
                const isLover = Math.random() < 0.7;
                
            if (isLover) {
                resultText.innerHTML = `Yes! <span class="heart">♥</span> ${name} and you should be lovers!`;
                resultImage.src = 'https://thafd.bing.com/th/id/OIP.2Sq1s5-eL84ofUEAkmy3UAAAAA?w=149&h=161&c=7&r=0&o=5&dpr=1.3&pid=1.7';
            } else {
                resultText.innerHTML = `Hmm... ${name} and you might be better as friends.`;
                resultImage.src = 'https://www.bing.com/th/id/OGC.a5d3285e6a42f695d14b0797dc6e1d4e?pid=1.7&rurl=https%3a%2f%2fgifdb.com%2fimages%2fhigh%2ffreaked-out-sad-cat-sobbing-x81xcmvrn4yyk9j9.gif&ehk=uP%2f7z9%2br9KKX0vtDpF6wgDVCDWWLPp%2fYNSmeThQuNP4%3d';
            }

            }, 2000);
        });
        
        document.getElementById('tryAgainBtn').addEventListener('click', function() {
            
            document.getElementById('nameInput').value = '';
            document.getElementById('result').classList.add('hidden');
            document.querySelector('p').classList.remove('hidden');
            document.getElementById('nameInput').classList.remove('hidden');
            document.getElementById('decideBtn').classList.remove('hidden');
        });
    