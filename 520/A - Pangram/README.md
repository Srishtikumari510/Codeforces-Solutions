<h2><a href="https://codeforces.com/contest/520/problem/A" target="_blank" rel="noopener noreferrer">520A — Pangram</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | Java 8 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 520A](https://codeforces.com/contest/520/problem/A) |

## Topics
`implementation` `strings`

---

## Problem Statement

<div class="header"><div class="title">A. Pangram</div><div class="time-limit"><div class="property-title">time limit per test</div>2 seconds</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>A word or a sentence in some language is called a <span class="tex-font-style-it">pangram</span> if all the characters of the alphabet of this language appear in it <span class="tex-font-style-it">at least once</span>. Pangrams are often used to demonstrate fonts in printing or test the output devices.</p><p>You are given a string consisting of lowercase and uppercase Latin letters. Check whether this string is a pangram. We say that the string contains a letter of the Latin alphabet if this letter occurs in the string in uppercase or lowercase.</p></div><div class="input-specification"><div class="section-title">Input</div><p>The first line contains a single integer <span class="tex-span"><i>n</i></span> (<span class="tex-span">1 ≤ <i>n</i> ≤ 100</span>) — the number of characters in the string.</p><p>The second line contains the string. The string consists only of uppercase and lowercase Latin letters.</p></div><div class="output-specification"><div class="section-title">Output</div><p>Output "<span class="tex-font-style-tt">YES</span>", if the string is a pangram and "<span class="tex-font-style-tt">NO</span>" otherwise.</p></div><div class="sample-tests"><div class="section-title">Examples</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id00694760317116683" id="id00012216811212110934" class="input-output-copier">Copy</div></div><pre id="id00694760317116683">12<br>toosmallword<br></pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id0039737837984675106" id="id005499180493895811" class="input-output-copier">Copy</div></div><pre id="id0039737837984675106">NO<br></pre></div><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id006858441065118861" id="id0006149075904452128" class="input-output-copier">Copy</div></div><pre id="id006858441065118861">35<br>TheQuickBrownFoxJumpsOverTheLazyDog<br></pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id0014005601528659628" id="id009507115562456581" class="input-output-copier">Copy</div></div><pre id="id0014005601528659628">YES<br></pre></div></div></div>