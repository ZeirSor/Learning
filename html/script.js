function countText() {
    const textInput = document.getElementById("textInput").value;
    const numMap = new Map();
    let totalSum = 0;

    const nums = textInput.match(/\d+\.\d+|\d+/g);

    if (nums) {
        nums.forEach(num => {
            const numFloat = parseFloat(num);
            numMap.set(numFloat, (numMap.get(numFloat) || 0) + 1);
            totalSum += numFloat;
        });
    }

    let originalResults = "<strong>统计如下:</strong><br>";
    [...numMap.entries()].sort(([num1], [num2]) => num2 - num1).forEach(([num, count]) => {
        originalResults += `${num}元: ${count}个<br>`;
    });

    originalResults += `<strong>总共: ${totalSum.toFixed(2)}元</strong><br>`;
    const totalSumInt = Math.ceil(totalSum / 10) * 10;
    originalResults += `取整后: ${totalSumInt}元`;

    const resultElement = document.getElementById("result");
    resultElement.innerHTML = originalResults;
}

function copyText() {
    const resultElement = document.getElementById("result");
    const textArea = document.createElement("textarea");
    let copiedText = resultElement.innerHTML.replace(/<br>/g, '\n'); // Replacing <br> with newline
    copiedText = copiedText.replace(/<strong>/g, ''); // Removing <strong> tags
    copiedText = copiedText.replace(/<\/strong>/g, ''); // Removing </strong> tags
    textArea.value = copiedText;
    document.body.appendChild(textArea);
    textArea.select();
    document.execCommand("copy");
    document.body.removeChild(textArea);
    alert("复制成功！");
}
