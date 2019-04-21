import * as React from "react";
import * as resource from "aem-react-js/component/ResourceComponent";
import ServiceProxy from "aem-react-js/di/ServiceProxy";

export default class Banner extends resource.ResourceComponent<any,any,any> {

    public renderBody(): React.ReactElement<any> {
        let Heading: string = this.getResource().heading;
        let subHeading: string = this.getResource().subheading;
    let imagePath: string = this.getResource().imagePathDrop;
  
        if (this.isWcmEnabled() && !Heading) {
            Heading = "please enter heading";
        }         return (
              
        <div>Heading..<h1>{Heading} .....</h1>and<p>Description.....</p><br/><p>{subHeading}</p>
        <div><img src={imagePath} alt={"banner"}/> </div></div>
        );
    }
}