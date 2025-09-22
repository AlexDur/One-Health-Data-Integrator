import {AfterViewInit, Component, ElementRef, ViewChild} from '@angular/core';
import {Router} from "@angular/router";

@Component({
  selector: 'app-kamera-oeffnen',
  templateUrl: './kamera-oeffnen.component.html',
  styleUrls: ['./kamera-oeffnen.component.scss']
})
export class KameraOeffnenComponent implements AfterViewInit{
  @ViewChild('videoElement') videoElement!: ElementRef<HTMLVideoElement>;

  constructor(private router: Router) {
  }

  ngAfterViewInit() {
    // Sicherstellen, dass das Video-Element geladen hat, bevor man darauf zugreift
  }

  async startCamera() {
    if (navigator.mediaDevices && navigator.mediaDevices.getUserMedia) {
      try {
        const stream = await navigator.mediaDevices.getUserMedia({video: true});
        if (this.videoElement.nativeElement) {
          this.videoElement.nativeElement.srcObject = stream;
        }
      } catch (error) {
        console.error('Fehler beim Zugriff auf die Kamera: ', error);
      }
    } else {
      alert('getUserMedia wird von Ihrem Browser nicht unterstützt.');
    }
  }
}
