# Red Knight
Red Knight is chasing two pawns. Which pawn will be caught, and where?

### Input / Output
Input will be two integers:

* `N` / `n` (Ruby) vertical position of Red Knight (`0` or `1`).
* `P` / `p` (Ruby) horizontal position of two pawns (between `2` and `1000000`).

Output has to be a *tuple* (python, haskell, Rust, prolog, C#), an *array* (javascript, ruby), an *object* (java), or a *structure* (C) with:

* `"Black"` or `"White"` - which pawn was caught
* Where it was caught (horizontal position)

### Example

```java
// This class is preloaded
class PawnDistance {

    public PawnDistance(String s, long d) {
    }
}

Input=0,4;
        Output=new PawnDistance("White",8);
```
<svg xmlns="http://www.w3.org/2000/svg" height="142" width="450">
 <g>
  <title>background</title>
 </g>
 <g>
  <title>Layer 1</title>
  <rect y="9.28571" fill="#769656" stroke-width="0" x="77" width="50" height="50" id="svg_1" stroke="#fff"></rect>
  <rect fill="#eeeed2" stroke-width="0" x="27" y="9.28571" width="50" height="50" id="svg_2" stroke="#fff"></rect>
  <rect fill="#eeeed2" stroke-width="0" x="127" y="9.28571" width="50" height="50" id="svg_4" stroke="#fff"></rect>
  <rect y="9.28571" fill="#769656" stroke-width="0" x="277" width="50" height="50" id="svg_3" stroke="#fff"></rect>
  <rect fill="#eeeed2" stroke-width="0" x="227" y="9.28571" width="50" height="50" id="svg_6" stroke="#fff"></rect>
  <rect fill="#eeeed2" stroke-width="0" x="327" y="9.28571" width="50" height="50" id="svg_7" stroke="#fff"></rect>
  <rect fill="#769656" stroke-width="0" x="177" y="9.28571" width="50" height="50" id="svg_8" stroke="#fff"></rect>
  <rect y="59.28572" fill="#769656" stroke-width="0" x="127" width="50" height="50" id="svg_9" stroke="#fff"></rect>
  <rect fill="#eeeed2" stroke-width="0" x="77" y="59.28572" width="50" height="50" id="svg_10" stroke="#fff"></rect>
  <rect fill="#eeeed2" stroke-width="0" x="177" y="59.28572" width="50" height="50" id="svg_11" stroke="#fff"></rect>
  <rect fill="#769656" stroke-width="0" x="27" y="59.28572" width="50" height="50" id="svg_12" stroke="#fff"></rect>
  <rect y="59.28572" fill="#769656" stroke-width="0" x="327.00001" width="50" height="50" id="svg_13" stroke="#fff"></rect>
  <rect fill="#eeeed2" stroke-width="0" x="277.00001" y="59.28572" width="50" height="50" id="svg_14" stroke="#fff"></rect>
  <rect fill="#eeeed2" stroke-width="0" x="377.00001" y="59.28572" width="50" height="50" id="svg_15" stroke="#fff"></rect>
  <rect fill="#769656" stroke-width="0" x="227.00001" y="59.28572" width="50" height="50" id="svg_16" stroke="#fff"></rect>
  <rect fill="#769656" stroke-width="0" x="377" y="9.28571" width="50" height="50" id="svg_17" stroke="#fff"></rect>
  <path fill="#c43131" stroke-width="NaN" d="m58.63751,53.70918c1.38529,0.04365 3.41278,-0.61956 1.99635,-2.09899c-1.5421,-0.56322 0.27408,-2.43002 -1.27137,-3.30938c-1.24049,-1.63665 -2.92636,-3.13124 -3.43512,-5.12989c0.07901,-1.35549 1.82523,-2.15768 0.99213,-3.65801c0.81734,-2.4009 0.62845,-5.16434 -0.86355,-7.32255c-1.26691,-2.00454 -2.80508,-4.12849 -2.64286,-6.55426c1.58894,0.61479 3.27086,1.15345 5.01957,0.87424c1.64404,-0.14147 3.1185,1.09202 4.79548,0.42132c1.69992,-0.32724 2.71106,-2.43327 1.44359,-3.66438c-1.3851,-1.09624 -3.42017,-1.13153 -4.74114,-2.35496c-1.74288,-1.33774 -3.35495,-3.14709 -5.75706,-3.38359c-1.06168,-0.22522 -1.51705,-1.21372 -2.10474,-1.95451c-0.48838,1.17491 -1.33781,2.21385 -2.61625,2.73471c-2.59972,1.39527 -3.24686,4.34504 -4.20557,6.7699c-0.70885,1.89907 -1.29942,3.88184 -2.48643,5.57723c-0.01262,0.81368 1.31978,1.1576 0.41984,2.11149c-0.46804,2.58709 -0.48819,5.23629 -0.44669,7.85361c0.78938,1.28084 1.5084,2.71045 0.4554,4.18038c-0.70338,1.79667 -2.45513,2.97504 -3.31697,4.67046c-0.48718,0.87789 0.94977,2.15243 -0.84056,1.93164c-1.63499,0.80149 -0.31478,2.75789 1.31134,2.18873c6.09395,0.14358 12.20133,0.28696 18.29462,0.11678l0,0l-0.00001,0.00003z" id="svg_5" stroke="#544545"></path>
  <text fill="#ff7f00" stroke="#6b5656" stroke-width="NaN" x="92.41379" y="131.50108" id="svg_21" font-size="24" font-family="Helvetica, Arial, sans-serif" text-anchor="start" xml:space="preserve">1</text>
  <text fill="#ff7f00" stroke="#6b5656" stroke-width="NaN" x="143.44827" y="132.53556" id="svg_22" font-size="24" font-family="Helvetica, Arial, sans-serif" text-anchor="start" xml:space="preserve">2</text>
  <text fill="#ff7f00" stroke="#6b5656" stroke-width="NaN" x="193.7931" y="132.19073" id="svg_23" font-size="24" font-family="Helvetica, Arial, sans-serif" text-anchor="start" xml:space="preserve">3</text>
  <text fill="#ff7f00" stroke="#6b5656" stroke-width="NaN" x="42.06896" y="130.4666" id="svg_24" font-size="24" font-family="Helvetica, Arial, sans-serif" text-anchor="start" xml:space="preserve">0</text>
  <text fill="#ff7f00" stroke="#6b5656" stroke-width="NaN" x="244.13794" y="132.19073" id="svg_25" font-size="24" font-family="Helvetica, Arial, sans-serif" text-anchor="start" xml:space="preserve">4</text>
  <text fill="#ff7f00" stroke="#6b5656" stroke-width="NaN" x="296.89656" y="132.53556" id="svg_26" font-size="24" font-family="Helvetica, Arial, sans-serif" text-anchor="start" xml:space="preserve">5</text>
  <text fill="#ff7f00" stroke="#6b5656" stroke-width="NaN" x="345.17241" y="131.50108" id="svg_27" font-size="24" font-family="Helvetica, Arial, sans-serif" text-anchor="start" xml:space="preserve">6</text>
  <text fill="#ff7f00" stroke="#6b5656" stroke-width="NaN" x="397.58621" y="131.15625" id="svg_28" font-size="24" font-family="Helvetica, Arial, sans-serif" text-anchor="start" xml:space="preserve">7</text>
  <text fill="#ff7f00" stroke="#6b5656" stroke-width="NaN" x="5.17241" y="38.0528" id="svg_29" font-size="24" font-family="Helvetica, Arial, sans-serif" text-anchor="start" xml:space="preserve">0</text>
  <text fill="#ff7f00" stroke="#6b5656" stroke-width="NaN" x="4.82758" y="89.43211" id="svg_30" font-size="24" font-family="Helvetica, Arial, sans-serif" text-anchor="start" xml:space="preserve">1</text>
  <path fill="none" stroke-width="NaN" d="m91.71362,39.19855l50.78449,0l0,24.65518l-7.78448,0l15.56896,12.32759l15.56897,-12.32759l-7.78449,0l0,-36.98277l-66.35345,0l0,12.32759z" id="svg_31" stroke="#544545"></path>
  <path fill="none" stroke="#544545" stroke-width="NaN" stroke-opacity="null" d="m281.52305,42.45613l4.48309,-4.21317l-8.66784,0l-8.66782,0l0,-2.60815l0,-2.60815l8.56838,0c4.7126,0 8.56838,-0.13219 8.56838,-0.29376c0,-0.16157 -1.87607,-2.05749 -4.16905,-4.21317l-4.16906,-3.91941l3.85348,0l3.85347,0l5.88512,5.52253l5.88512,5.52252l-5.89641,5.51196l-5.89641,5.51196l-4.05678,0l-4.05679,0l4.4831,-4.21317l0,0l0.00002,0.00001z" id="svg_32"></path>
  <path fill="none" stroke="#544545" stroke-width="NaN" stroke-opacity="null" d="m281.52305,90.04234l4.48309,-4.21317l-8.66784,0l-8.66782,0l0,-2.60815l0,-2.60815l8.56838,0c4.71261,0 8.56838,-0.13219 8.56838,-0.29377c0,-0.16156 -1.87607,-2.05749 -4.16905,-4.21316l-4.16906,-3.91941l3.85349,0l3.85347,0l5.88512,5.52253l5.88512,5.52253l-5.89641,5.51195l-5.8964,5.51196l-4.05679,0l-4.05679,0l4.48311,-4.21316l0,0z" id="svg_33"></path>
 </g>
 <g>
  <title>background</title>
 </g>
 <g>
  <title>background</title>
  <rect x="-1" y="-1" width="452" height="144" id="canvas_background" fill="none"></rect>
  <path fill="#fff" stroke="#000" d="m243.23375,47.58404c-1.01358,0.15423 -2.4698,-0.80853 -1.18661,-1.68349c1.0859,-0.56899 0.04388,-2.05065 1.19219,-2.77034c1.16763,-1.59407 2.41073,-3.22356 2.99261,-5.13613c-0.08119,-0.91627 -1.89601,-2.433 -0.05741,-2.73018c1.51604,0.17624 0.96156,-2.0935 1.48554,-3.07695c0.31508,-1.49274 0.54411,-3.01038 0.48757,-4.5393c-1.05579,-0.02948 -2.1332,0.09344 -3.16827,-0.15758c-0.66024,-0.86664 1.49169,-1.29814 1.84678,-2.08039c0.74504,-1.12431 -1.09067,-2.36654 -0.30486,-3.69561c0.50193,-2.01193 2.82394,-3.31633 4.7887,-2.57933c2.03456,0.52762 3.53852,2.93101 2.5715,4.93018c-0.0772,0.38569 -0.68143,0.88577 -0.47963,1.19291c0.88097,0.61138 1.901,1.14419 2.45915,2.08822c-0.79027,0.573 -2.1126,0.13662 -3.09861,0.40882c-0.89704,0.79568 -0.01095,2.42257 0.03499,3.51422c0.27984,1.24728 0.52689,2.50556 0.84758,3.74147c0.67416,0.26297 2.05885,0.56747 1.29927,1.65988c-1.08286,0.87908 -0.5528,2.2793 0.05812,3.26578c0.76036,1.52343 2.0656,2.6872 2.86521,4.17544c0.29694,0.68709 -0.76459,1.90396 0.55841,1.6194c1.43428,0.30467 0.576,2.29341 -0.71284,1.82354c-4.74882,0.16721 -9.50739,0.23509 -14.25632,0.05013l-0.22308,-0.0207l0,0l0,0z" id="svg_18"></path>
  <path fill="#000000" stroke-width="1.5" d="m242.89477,100.80436c-1.01358,0.15423 -2.4698,-0.80853 -1.18661,-1.68349c1.0859,-0.56899 0.04388,-2.05064 1.19219,-2.77033c1.16763,-1.59407 2.41073,-3.22356 2.99261,-5.13613c-0.08119,-0.91627 -1.89602,-2.433 -0.05742,-2.73018c1.51605,0.17624 0.96156,-2.0935 1.48554,-3.07696c0.31508,-1.49274 0.54411,-3.01037 0.48758,-4.53929c-1.0558,-0.02948 -2.1332,0.09344 -3.16827,-0.15758c-0.66024,-0.86664 1.49169,-1.29814 1.84678,-2.08039c0.74504,-1.12431 -1.09067,-2.36654 -0.30486,-3.69561c0.50192,-2.01193 2.82394,-3.31633 4.7887,-2.57933c2.03456,0.52761 3.53852,2.931 2.5715,4.93017c-0.0772,0.38569 -0.68143,0.88577 -0.47963,1.19292c0.88097,0.61138 1.901,1.14419 2.45915,2.08821c-0.79026,0.57301 -2.11259,0.13663 -3.0986,0.40882c-0.89705,0.79568 -0.01096,2.42257 0.03499,3.51422c0.27984,1.24728 0.52689,2.50556 0.84758,3.74147c0.67415,0.26297 2.05885,0.56747 1.29927,1.65989c-1.08286,0.87908 -0.5528,2.27929 0.05812,3.26577c0.76036,1.52343 2.06559,2.6872 2.86521,4.17544c0.29695,0.68709 -0.76459,1.90396 0.55841,1.6194c1.43428,0.30468 0.57601,2.29342 -0.71284,1.82354c-4.74882,0.16721 -9.50739,0.23509 -14.25632,0.05013l-0.22308,-0.02069l0,0l0,0z" id="svg_20"></path>
 </g>
</svg>

###Notes
* Red Knight will always start at horizontal position `0`.
* The black pawn will always be at the bottom (vertical position `1`).
* The white pawn will always be at the top (vertical position `0`).
* The pawns move first, and they move simultaneously.
* Red Knight moves `2` squares forward and `1` up or down.
* Pawns always move `1` square forward.
* Both pawns will start at the same horizontal position.