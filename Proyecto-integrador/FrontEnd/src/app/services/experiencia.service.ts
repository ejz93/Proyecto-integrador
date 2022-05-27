import { HttpClient } from '@angular/common/http';
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { environment } from "src/environments/environment";
import { Experiencia } from "../models/experiencia";

@Injectable({
    providedIn: "root"
})
export class ExperienciaService {
    private apiServerUrl=environment.apiBaseUrl;

    constructor(private http:HttpClient) { }

    public getExperiencia():Observable<Experiencia[]>{
        return this.http.get<Experiencia[]>(`${this.apiServerUrl}/experiencia/all`);
    }

    public addExperiencia(experiencia: Experiencia):Observable<Experiencia>{
        return this.http.post<Experiencia>(`${this.apiServerUrl}/experiencia/add`,experiencia);
    }

    public updateEducacion(experiencia: Experiencia):Observable<Experiencia>{
        return this.http.put<Experiencia>(`${this.apiServerUrl}/experiencia/update`,experiencia);
    }

    public deleteExperiencia(experienciaId: number):Observable<void>{
        return this.http.delete<void>(`${this.apiServerUrl}/experiencia/delete/${experienciaId}`);
    }
}