import { Stack, StackProps } from 'aws-cdk-lib'
import { Service } from '@karamvsingh/backend-framework-cdk-constructs'
import { Construct } from 'constructs'
import { Runtime } from 'aws-cdk-lib/aws-lambda'

export class ServiceStack extends Stack {
    constructor(scope: Construct, id: string, props: StackProps) {
        super(scope, id, props)
        const api = new Service(this, 'api', {
            runtime: Runtime.NODEJS_16_X,
            assetsPackage: 'assets',
            modelPackage: '@karamvsingh/backend-framework-example-model',
            apiName: 'api',
            functionName: 'backend-lambda',
        })
    }
}
