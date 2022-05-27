import { HttpErrorResponse } from '@angular/common/http';
import { error } from '@angular/compiler/src/util';
import { Component, OnInit } from '@angular/core';
import { Persona } from 'src/app/model/persona.model';
import { HeaderService } from 'src/app/service/header.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  public persona: Persona | undefined;
  public editPersona: Persona | undefined;

  constructor(private headerService: HeaderService) { }

  ngOnInit(): void {
    
  }

}
