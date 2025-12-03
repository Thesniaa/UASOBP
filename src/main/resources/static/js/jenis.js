function showField(jenis) {
    document.getElementById("atasan-field").style.display = "none";
    document.getElementById("bawahan-field").style.display = "none";
    document.getElementById("luaran-field").style.display = "none";

    if (jenis === "atasan") {
        document.getElementById("atasan-field").style.display = "block";
    } else if (jenis === "bawahan") {
        document.getElementById("bawahan-field").style.display = "block";
    } else if (jenis === "luaran") {
        document.getElementById("luaran-field").style.display = "block";
    }
}


