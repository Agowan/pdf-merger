#PdfMerger
I created this simple library when I had to much problems with other known html to pdf libraries.

## Howto create jar
First just standard java compile
```bash
javac -cp itext-2.0.8.jar PdfMerger.java
```
Then bundle it in a jar in order to execute it in a single file
```bash
jar cfm PdfMerger.jar manifest.txt PdfMerger.class
```

## Usage
The program takes paths to existing files delimited with spaces or , ; : and then returns the merged pdf on standard out
```bash
echo path/to/file_1.pdf path/to/file_2.pdf | java -jar PdfMerger.jar > hello_world.pdf
```

## Using ruby?
Consider using [pdftool](https://github.com/Agowan/pdftool)